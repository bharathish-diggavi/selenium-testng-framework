package example.example.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.mail.Message.RecipientType;

import org.simplejavamail.email.Email;
import org.simplejavamail.email.EmailBuilder;
import org.simplejavamail.email.Recipient;
import org.simplejavamail.mailer.Mailer;
import org.simplejavamail.mailer.MailerBuilder;
import org.simplejavamail.mailer.config.TransportStrategy;

/**
 * The Class is responsible for Mailing.
 *
 * @author Bharathish
 */
public class MailUtil {

	/**
	 * Send mail.
	 *
	 * @param total the total
	 * @param passed the passed
	 * @param failed the failed
	 * @param skipped the skipped
	 * @return true, if successful
	 */
	@SuppressWarnings("unused")
	public static boolean sendMail(int total, int passed, int failed, int skipped) {

		boolean sendMail = Boolean.parseBoolean(TestProperties.getProperty("mail.sendmail"));

		if (sendMail) {
			try {
				String[] tos = TestProperties.getProperty("mail.to").split(",");
				String from = TestProperties.getProperty("mail.from");
				String mailHost = TestProperties.getProperty("mail.host");
				int port = Integer.parseInt(TestProperties.getProperty("mail.port"));
				String username = TestProperties.getProperty("mail.user");
				String pwd = TestProperties.getProperty("mail.password");
//				String proxyServer = TestProperties.getProperty("mail.proxy.server");
//				int proxyPort = Integer.parseInt(TestProperties.getProperty("mail.proxy.port"));
//				String proxyUsername = TestProperties.getProperty("mail.proxy.user");
//				String proxyPassword = TestProperties.getProperty("mail.proxy.password");
				String mailSubject = TestProperties.getProperty("mail.subject");
				List<Recipient> recipients = new ArrayList<>();
				Arrays.asList(tos).forEach(to -> {
					try {
						recipients.add(new Recipient("", to, RecipientType.TO));
					} catch (Exception e) {
						LoggerUtil.log("Mail id is not correct : " + to);
					}
				});

				/*
				 * Enter smtp host, port, username and password in smtpserver details, If you
				 * are running tests behind proxy, uncomment and enter proxy details
				 */
				Mailer mailer = MailerBuilder.withSMTPServer(mailHost, port, username, pwd)
//						.withProxy(proxyServer, proxyPort, proxyUsername, proxyPassword).clearEmailAddressCriteria()
						.withProperty("mail.smtp.sendpartial", "true").withProperty("mail.smtp.auth", "true")
						.withProperty("mail.smtp.starttls.enable", "true")
						.withTransportStrategy(TransportStrategy.SMTP_TLS).buildMailer();

				Email email = EmailBuilder.startingBlank().from("Automation Execution", from).withRecipients(recipients)
						.withSubject(mailSubject + " | " + new SimpleDateFormat("MM-dd-yyyy").format(new Date()))
						.withHTMLText(getMailBody(total, passed, failed, skipped)).buildEmail();

				mailer.sendMail(email);
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				LoggerUtil.getLogger().fatal("Could not send mail : " + e.getMessage());
				return false;
			}
		} else {
			LoggerUtil.log("Mail sending toggel is set to false");
			return false;
		}
	}

	/**
	 * Gets the mail body.
	 *
	 * @param total the total
	 * @param passed the passed
	 * @param failed the failed
	 * @param skipped the skipped
	 * @return the mail body
	 */
	private static String getMailBody(int total, int passed, int failed, int skipped) {
		return "<!DOCTYPE html>\r\n" + "<html>\r\n" + "<body>\r\n" + "<h1>Automation Execution report...</h1>\r\n"
				+ "<table border=\"1\" style=\"width:100%;text-align:center;\">\r\n" + "  <tr>\r\n"
				+ "    <th style=\"color:blue\">Total</th>\r\n" + "    <th style=\"color:green\">Passed</th>\r\n"
				+ "    <th style=\"color:red\">Failed</th>\r\n" + "    <th style=\"color:yellow\">Skipped</th>\r\n"
				+ "  </tr>\r\n" + "  <tr>\r\n" + "    <td>" + total + "</td>\r\n" + "    <td>" + passed + "</td>\r\n"
				+ "    <td>" + failed + "</td>\r\n" + "    <td>" + skipped + "</td>\r\n" + "  </tr>\r\n"
				+ "</table>\r\n" + "</body>\r\n" + "</html>\r\n" + "";
	}
}
