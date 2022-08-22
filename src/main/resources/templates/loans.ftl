<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Loans</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <style>
        a {
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
        .btn-fake{
            --bs-btn-color: #fff;
            --bs-btn-bg: #373b3e;
            --bs-btn-border-color: #373b3e;
            --bs-btn-hover-color: #fff;
            --bs-btn-hover-bg: #424649;
            --bs-btn-hover-border-color: #373b3e;
            --bs-btn-focus-shadow-rgb: none;
            --bs-btn-active-color: #fff;
            --bs-btn-active-bg: #4d5154;
            --bs-btn-active-border-color: #373b3e;
            --bs-btn-active-shadow: none;
            --bs-btn-disabled-color: #fff;
            --bs-btn-disabled-bg: #373b3e;
            --bs-btn-disabled-border-color: #373b3e;
            border-radius: 0.375rem 0.375rem 0rem 0rem;
        }
    </style>
</head>
<body style="color:#fff; background-color:#212529">

<h1>Hello, loans!</h1>
<button type="button" class="btn btn-fake">loans</button>
<button type="button" class="btn btn-dark"><a href="/ui/v1/customer/">customers</a></button>
<button type="button" class="btn btn-dark"><a href="/ui/v1/loans/types/">types</a></button>
<button type="button" class="btn btn-dark"><a href="/ui/v1/loans/types/conditions/">conditions</a></button>
<button type="button" class="btn btn-dark"><a href="/ui/v1/customer/professions/">professions</a></button>
<table class="table table-dark table-striped">
    <tr>
        <th> ID</th>
        <th> Name</th>
        <th> Type</th>
        <th> Customer</th>
        <th> Sum</th>
        <th> Payment</th>
        <th> Issuance</th>
        <th> Refund</th>
        <th> createdAt</th>
        <th> updatedAt</th>
        <th></th>
        <th>
            <a href="/ui/v1/loans/add">
                <button type="button" class="btn btn-success">Create</button>
            </a>
        </th>
    </tr>
    <#list loans as loan>
        <tr>
            <td>${loan.id}</td>
            <td>${loan.name}</td>
            <td><a href="http://localhost:8080/ui/v1/loans/types/${loan.type.id}"
                   class="link1">${loan.type.name}</a>
            </td>
            <td><a href="http://localhost:8080/ui/v1/customer/${loan.customer.id}"
                   class="link1">${loan.customer.name}</a></td>
            <td>${loan.sum}</td>
            <td>${loan.payment}</td>
            <td>${loan.dateIssuance}</td>
            <td>${loan.dateRefund}</td>
            <td>${loan.createdAt}</td>
            <td>${loan.updatedAt}</td>
            <td>
                <button type="button" class="btn btn-success">Update</button>
            </td>
            <td>
                <a href="http://localhost:8080/ui/v1/loans/del/${loan.id}">
                    <button type="button" class="btn btn-danger">Delete</button>
                </a>
            </td>
        </tr>
    </#list>
</table>
</body>
</html>