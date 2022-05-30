<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Random Password Generator</title>
</head>
<body>
	<form method="get" action="PasswordGenerator">
		<div id="LogoText">
			<center>
				<h1>
					<b><u>Password Generator</u></b>
				</h1>
			</center>
		</div>
		<table>
			<tr>
				<td>Please Select Max Password Length:</td>
				<td><select id="pgLength"
					title="Select the length of your password." name="maxlen">
						<optgroup label="Weak">
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
						</optgroup>
						<optgroup label="Strong">
							<option value="9">9</option>
							<option value="10">10</option>
							<option value="11">11</option>
							<option value="12">12</option>
							<option value="13">13</option>
							<option value="14">14</option>
							<option value="15">15</option>
						</optgroup>
				</select></td>
			</tr>
			<tr>
				<td>Please Enter "Y" for Special Characters (@#$!):</td>
				<td><input type="text" name="splchar" size="1" maxlength="1"></td>


			</tr>
			<tr>
				<td>Please Enter "Y" to include Lower Case Alphabets(a-z):</td>
				<td><input type="text" name="lower" size="1" maxlength="1"></td>

			</tr>
			<tr>
				<td>Please Enter "Y" to include Upper Case Alphabets(A-Z):</td>
				<td><input type="text" name="upper" size="1" maxlength="1"></td>

			</tr>
			<tr>
				<td>Please Enter "Y" to include Numerics (0-9):</td>
				<td><input type="text" name="num" size="1" maxlength="1"></td>

			</tr>
			<tr>
				<td>Please Click Below Button To Generate Random Password.</td>
				<td></td>
			</tr>

			<tr>
				<td><input type="submit" value="Generate Password"></td>
				<td></td>
			</tr>

		</table>
	</form>
</body>
</html>