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
    <th> Name</th>
    <th> Work Experience</th>
    <th> Salary</th>
    <th> createdAt</th>
    <th> updatedAt</th>
    <th><a href="#" onclick="history.go(-1);return false;">
        <button type="button" class="btn btn-primary">Back</button>
    </a></th>
  </tr>
  <tr>
    <td>${profession.id}</td>
    <td>${profession.name}</td>
    <td>${profession.workExperience}</td>
    <td>${profession.salary}</td>
    <td>${profession.createdAt}</td>
    <td>${profession.updatedAt}</td>
    <td>
    </td>
  </tr>
</table>
</body>
</html>