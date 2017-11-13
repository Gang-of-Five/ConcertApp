<#import "/spring.ftl" as spring/>
<html>

<head>
    <title>Insert User Page</title>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width" , initial-scale="1">
    <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.5.3/css/bootstrapValidator.min.css">
    <link rel="stylesheet" type="text/css" href="/css/global.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-validator/0.5.3/js/bootstrapValidator.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/1000hz-bootstrap-validator/0.9.0/validator.min.js"></script>

</head>

<body>

<div class="container">

    <form data-toggle="validator" role="form" name="registerForm" modelAttribute="insertUserForm" class="well form-horizontal" action="/home/insertUser" method="post" id="registerUserForm">
        <legend>
            <center><h2><b>Registration Form</b></h2></center>
        </legend><br>

        <div class="form-group">
            <label class="col-md-4 control-label">E-Mail</label>
            <div class="col-md-4 inputGroupContainer">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                    <input name="email" placeholder="Email" class="form-control" type="email" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,3}$" oninvalid="this.setCustomValidity('Required, please enter a valid email address.')" oninput="setCustomValidity('')" required>
                </div>
                <div class="help-block with-errors"></div>
            </div>
        </div>

        <div class="form-group">
            <label class="col-md-4 control-label">Username</label>
            <div class="col-md-4 inputGroupContainer">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-envelope"></i></span>
                    <input name="username" placeholder="Username" class="form-control" type="username" oninvalid="this.setCustomValidity('Required, please enter a valid username.')" oninput="setCustomValidity('')" required>
                </div>
                <div class="help-block with-errors"></div>
            </div>
        </div>

        <div class="form-group">
            <label class="col-md-4 control-label">Password</label>
            <div class="col-md-4 inputGroupContainer">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                    <input name="password" placeholder="Password" class="form-control" type="password" id="inputPassword" oninvalid="this.setCustomValidity('Required, please enter your password.')" oninput="setCustomValidity('')" required>
                </div>
                <div class="help-block with-errors"></div>
            </div>
        </div>

        <div class="form-group">
            <label class="col-md-4 control-label">Confirm password</label>
            <div class="col-md-4 inputGroupContainer">
                <div class="input-group">
                    <span class="input-group-addon"><i class="glyphicon glyphicon-lock"></i></span>
                    <input type="password" placeholder="Confirm password" class="form-control" name="confirmPassword" id="inputConfirmPassword" data-match="#inputPassword" data-match-error="Password and Confirm Password don't match." oninvalid="this.setCustomValidity('Required, please confirm your password.')"
                           oninput="setCustomValidity('')" required/>
                </div>
                <div class="help-block with-errors"></div>
            </div>
        </div>

        <div class="form-group">
            <label class="col-md-4 control-label"></label>
            <div class="col-md-4"><br>
                <button type="submit" class="btn btn-success btn-block">Submit</button>
            </div>
        </div>
    </form>
</div>
</body>

</html>