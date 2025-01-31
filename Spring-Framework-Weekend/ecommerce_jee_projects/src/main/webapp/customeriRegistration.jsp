<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>customerRegistration</title>
</head>
<h2>CustomerPage</h2>
<body style="font-family: Arial, sans-serif; background-color: #f4f4f9; padding: 50px; text-align: center;">

    <div style="max-width: 400px; margin: auto; padding: 30px; background-color: white; border-radius: 8px; box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);">
        <h2 style="margin-bottom: 20px; color: #333;">Registration Form</h2>
        
        <form action="#" method="post">
            <div style="margin-bottom: 15px;">
                <label for="email" style="display: block; font-size: 14px; color: #333;">Email:</label>
                <input type="email" id="email" name="email" required placeholder="Enter your email" style="width: 100%; padding: 10px; font-size: 14px; border-radius: 4px; border: 1px solid #ccc;"/>
            </div>

            <div style="margin-bottom: 15px;">
                <label for="password" style="display: block; font-size: 14px; color: #333;">Password:</label>
                <input type="password" id="password" name="password" required placeholder="Enter your password" style="width: 100%; padding: 10px; font-size: 14px; border-radius: 4px; border: 1px solid #ccc;"/>
            </div>

            <div style="margin-bottom: 15px;">
                <label for="confirm-password" style="display: block; font-size: 14px; color: #333;">Confirm Password:</label>
                <input type="password" id="confirm-password" name="confirm-password" required placeholder="Confirm your password" style="width: 100%; padding: 10px; font-size: 14px; border-radius: 4px; border: 1px solid #ccc;"/>
            </div>

            <div style="margin-bottom: 15px;">
                <label for="dob" style="display: block; font-size: 14px; color: #333;">Date of Birth:</label>
                <input type="date" id="dob" name="dob" required style="width: 100%; padding: 10px; font-size: 14px; border-radius: 4px; border: 1px solid #ccc;"/>
            </div>
            
            <div style="margin-bottom: 15px;">
                <label for="image" style="display: block; font-size: 14px; color: #333;">Image:</label>
                <input type="file" id="image" name="image" required style="width: 100%; padding: 10px; font-size: 14px; border-radius: 4px; border: 1px solid #ccc;"/>
            </div>

            <button type="submit" style="background-color: #4CAF50; color: white; padding: 12px 20px; border: none; border-radius: 4px; font-size: 16px; cursor: pointer; width: 100%; margin-top: 10px;">Register</button>
        </form>
    </div>

</body>
</html>