package password;

import java.security.SecureRandom;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

public class PasswordGeneratorMethod extends HttpServlet {

	public String passwordGen(HttpServletRequest request) {
		int maxLength = Integer.parseInt(request.getParameter("maxlen"));
		String strSplChar = request.getParameter("splchar");
		String strLower = request.getParameter("lower");
		String strUpper = request.getParameter("upper");
		String strNumeric = request.getParameter("num");
		String chars;
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();

		if (maxLength > 0 && !strUpper.isEmpty() && strUpper.equalsIgnoreCase("Y") && !strLower.isEmpty()
				&& strLower.equalsIgnoreCase("Y") && !strSplChar.isEmpty()
				&& (!strNumeric.isEmpty() && strNumeric.equalsIgnoreCase("Y"))) {
			chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$&!abcdefghijklmnopqrstuvwxyz0123456789";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}
		}
		// Spl Charcters , numerics and lower case
		else if (maxLength > 0 && !strLower.isEmpty() && strLower.equalsIgnoreCase("Y") && !strSplChar.isEmpty()
				&& (!strNumeric.isEmpty() && strNumeric.equalsIgnoreCase("Y"))) {
			chars = "@#$&!abcdefghijklmnopqrstuvwxyz0123456789";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}
		}
		// Spl Charcters , numerics and upper case
		else if (maxLength > 0 && !strUpper.isEmpty() && strUpper.equalsIgnoreCase("Y") && !strSplChar.isEmpty()
				&& (!strNumeric.isEmpty() && strNumeric.equalsIgnoreCase("Y"))) {
			chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$&!0123456789";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}
		}
		// Spl Charcters , lower and upper case
		else if (maxLength > 0 && !strUpper.isEmpty() && strUpper.equalsIgnoreCase("Y") && !strLower.isEmpty()
				&& strLower.equalsIgnoreCase("Y") && !strSplChar.isEmpty()) {
			chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$&!abcdefghijklmnopqrstuvwxyz";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}
		}
		// Numerics , lower and upper case
		else if (maxLength > 0 && !strUpper.isEmpty() && strUpper.equalsIgnoreCase("Y") && !strLower.isEmpty()
				&& strLower.equalsIgnoreCase("Y") && (!strNumeric.isEmpty() && strNumeric.equalsIgnoreCase("Y"))) {
			chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}
		}
		// both upper and spl chars
		else if (maxLength > 0 && !strUpper.isEmpty() && strUpper.equalsIgnoreCase("Y") && !strSplChar.isEmpty()
				&& strSplChar.equalsIgnoreCase("Y")) {
			chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$&!";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}

		}

		// both lower and spl chars
		else if (maxLength > 0 && !strLower.isEmpty() && strLower.equalsIgnoreCase("Y") && !strSplChar.isEmpty()
				&& strSplChar.equalsIgnoreCase("Y")) {
			chars = "abcdefghijklmnopqrstuvwxyz@#$&!";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}

		}
		// both Numerics and upper chars
		else if (maxLength > 0 && (!strNumeric.isEmpty() && strNumeric.equalsIgnoreCase("Y"))
				&& (!strUpper.isEmpty() && strUpper.equalsIgnoreCase("Y"))) {
			chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}

		}

		// both Numerics and spl chars
		else if (maxLength > 0 && !strNumeric.isEmpty() && strNumeric.equalsIgnoreCase("Y") && !strSplChar.isEmpty()
				&& strSplChar.equalsIgnoreCase("Y")) {
			chars = "0123456789@#$&!";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}

		}
		// both Numerics and lower chars
		else if (maxLength > 0 && !strNumeric.isEmpty() && strNumeric.equalsIgnoreCase("Y") && !strLower.isEmpty()
				&& strLower.equalsIgnoreCase("Y")) {
			chars = "0123456789abcdefghijklmnopqrstuvwxyz";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}
		}

		// Only Lower
		else if (maxLength > 0 && !strLower.isEmpty() && strLower.equalsIgnoreCase("Y")) {
			chars = "abcdefghijklmnopqrstuvwxyz";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}
		}
		// Only Spl Chars
		else if (maxLength > 0 && !strSplChar.isEmpty() && strSplChar.equalsIgnoreCase("Y")) {
			chars = "@#$!";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}
		}

		// Only Upper
		else if (maxLength > 0 && !strUpper.isEmpty() && strUpper.equalsIgnoreCase("Y")) {
			chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}
		}

		// Only Numerics
		else if (maxLength > 0 && !strNumeric.isEmpty() && strNumeric.equalsIgnoreCase("Y")) {
			chars = "0123456789";
			for (int i = 0; i <= maxLength - 1; i++) {
				int randomIndex = random.nextInt(chars.length());
				sb.append(chars.charAt(randomIndex));
			}
		}

		else {
			sb.append("");
		}

		return sb.toString();
	}

}
