<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <style>
        a{
            color: #fff;
            text-decoration: none;
        }
        a:hover{
            color:white;
        }

        .link1:hover {
            color: #0d6efd;
            border-style: solid;
            border-width: 2px;
            border-color: #0d6efd;
            transition: color 0.3s, border 0.3s, border-width 0s;
            border-radius: 10px;
        }
    </style>
</head>
<body style="color:#fff; background-color:#212529">

<h1>Hello, type!</h1>
<table class="table table-dark table-striped">
    <tr>
        <th> ID</th>
        <th> Passport ID</th>
        <th> Name</th>
        <th> Family</th>
        <th> Age</th>
        <th> Profession</th>
        <th> Property</th>
        <th> Address</th>
        <th> Phone</th>
        <th> contactPerson</th>
        <th> LoanHistory</th>
        <th> createdAt</th>
        <th> updatedAt</th>
        <th><a href="#" onclick="history.go(-1);return false;">
            <button type="button" class="btn btn-primary">Back</button>
        </a></th>
    </tr>
    <tr>
        <td>${customer.id}</td>
        <td>${customer.passportID}</td>
        <td>${customer.name}</td>
        <td>${customer.family?string('Yes', 'No')}</td>
        <td>${customer.age}</td>
        <td><a href="/ui/v1/customers/professions/${customer.profession.id}" class="link1">${customer.profession.name}</a></td>
        <td><a href="/ui/v1/customers/property/${customer.property.id}" class="link1">${customer.property}</a></td>
        <td>${customer.address}</td>
        <td>${customer.phone}</td>
        <td>${customer.contactPerson}</td>
        <td>${customer.loanHistory}</td>
        <td>${customer.createdAt}</td>
        <td>${customer.updatedAt}</td>
        <td>
        </td>
    </tr>
</table>
</body>
</html>