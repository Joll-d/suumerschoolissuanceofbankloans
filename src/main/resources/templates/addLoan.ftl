<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        input{

        }
    </style>
</head>
<body style="color:#fff; background-color:#212529">
<fieldset>
    <form name="item" action="" method="POST">
        <table class="table table-dark table-striped">
            <tr>
                <td>Name:</td>
                <td><@spring.formInput path="form.name" attributes="" fieldType="text"></@spring.formInput></td>
            </tr>
            <tr>
                <td>Type:</td>
                <td><@spring.formInput "form.type" "" "text"></@spring.formInput></td>

            </tr>
            <tr>
                <td>Customer:</td>
                <td><@spring.formInput "form.customer" "" "text"></@spring.formInput></td>
            </tr>
            <tr>
                <td>Sum:</td>
                <td><@spring.formInput "form.sum" "" "text"></@spring.formInput></td>
            </tr>
            <tr>
                <td>Payment:</td>
                <td><@spring.formInput "form.payment" "" "text"></@spring.formInput></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create" ></td>
            </tr>
        </table>
    </form>
</fieldset>
</body>
</html>