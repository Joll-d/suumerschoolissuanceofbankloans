<#import "/spring.ftl" as spring/>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Loans</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    <style>
        input {
            display: block;
            font-size: 16px;
            font-weight: 700;
            color: #444;
            line-height: 1.3;
            padding: .6em 1.4em .5em .8em;
            width: 100%;
            max-width: 100%;
            box-sizing: border-box;
            margin: 0;
            border: 1px solid #aaa;
            box-shadow: 0 1px 0 1px rgba(0, 0, 0, .04);
            border-radius: .5em;
            background-color: #fff;
            background-position: right .7em top 50%, 0 0;
            background-size: .65em auto, 100%;
        }

        .select-css {
            cursor: pointer;
            display: block;
            font-size: 16px;
            font-family: sans-serif;
            font-weight: 700;
            color: #444;
            line-height: 1.3;
            padding: .6em 1.4em .5em .8em;
            width: 100%;
            max-width: 100%;
            box-sizing: border-box;
            margin: 0;
            border: 1px solid #aaa;
            box-shadow: 0 1px 0 1px rgba(0, 0, 0, .04);
            border-radius: .5em;
            -moz-appearance: none;
            -webkit-appearance: none;
            appearance: none;
            background-color: #fff;
            background-image: url('data:image/svg+xml;charset=US-ASCII,%3Csvg%20xmlns%3D%22http%3A%2F%2Fwww.w3.org%2F2000%2Fsvg%22%20width%3D%22292.4%22%20height%3D%22292.4%22%3E%3Cpath%20fill%3D%22%23007CB2%22%20d%3D%22M287%2069.4a17.6%2017.6%200%200%200-13-5.4H18.4c-5%200-9.3%201.8-12.9%205.4A17.6%2017.6%200%200%200%200%2082.2c0%205%201.8%209.3%205.4%2012.9l128%20127.9c3.6%203.6%207.8%205.4%2012.8%205.4s9.2-1.8%2012.8-5.4L287%2095c3.5-3.5%205.4-7.8%205.4-12.8%200-5-1.9-9.2-5.5-12.8z%22%2F%3E%3C%2Fsvg%3E'), linear-gradient(to bottom, #ffffff 0%, #e5e5e5 100%);
            background-repeat: no-repeat, repeat;
            background-position: right .7em top 50%, 0 0;
            background-size: .65em auto, 100%;
        }

        .select-css::-ms-expand {
            display: none;
        }

        .select-css:hover {
            border-color: #888;
        }

        .select-css:focus {
            border-color: #aaa;
            box-shadow: 0 0 1px 3px rgba(59, 153, 252, .7);
            box-shadow: 0 0 0 3px -moz-mac-focusring;
            color: #222;
            outline: none;
        }

        .select-css option {
            font-weight: normal;
        }

        *[dir="rtl"] .select-css, :root:lang(ar) .select-css, :root:lang(iw) .select-css {
            background-position: left .7em top 50%, 0 0;
            padding: .6em .8em .5em 1.4em;
        }

        a {
            color: #fff;
            text-decoration: none;
        }

        a:hover {
            color: white;
        }

        .link1:hover {
            color: #0d6efd;
            border-style: solid;
            border-width: 2px;
            border-color: #0d6efd;
            transition: color 0.3s, border 0.3s, border-width 0s;
            border-radius: 10px;
        }

        .btn-fake {
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
    <style>
        /* Popup box BEGIN */
        .hover_bkgr_fricc {
            background: rgba(0, 0, 0, .4);
            display: none;
            height: 100%;
            position: fixed;
            text-align: center;
            top: 0;
            width: 100%;
            z-index: 10000;
        }

        .hover_bkgr_fricc .helper {
            display: inline-block;
            height: 100%;
            vertical-align: middle;
        }

        .hover_bkgr_fricc > div {
            background-color: #212529;
            box-shadow: 10px 10px 60px #555;
            display: inline-block;
            height: auto;
            max-width: 551px;
            min-height: 100px;
            vertical-align: middle;
            width: 60%;
            position: relative;
            border-radius: 8px;
            padding: 15px 5%;
        }

        .popupCloseButton {
            background-color: #212529;
            cursor: pointer;
            display: inline-block;
            font-family: arial;
            font-weight: bold;
            position: absolute;
            top: 0px;
            right: 0px;
            font-size: 25px;
            line-height: 30px;
            width: 30px;
            height: 30px;
            text-align: center;
        }

        .popupCloseButton:hover {
            background-color: #212529;
        }

        .trigger_popup_fricc {
            cursor: pointer;
            display: inline-block;
            font-weight: bold;
        }

        /* Popup box BEGIN */
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.2.0/jquery.min.js"></script>
    <script>

        $(window).load(function () {
            $("#createA").click(function () {
                $('#create').show();
            });
            $("#createA").click(function () {
                $('#emptyError').show();
            });
            $('.popupCloseButton').click(function () {
                $('.hover_bkgr_fricc').hide();
            });
        });

        $(window).load(function () {
            $('.popupCloseButton').click(function () {
                $('.hover_bkgr_fricc').hide();
            });
        });

        function getID(ID, name, sum) {
            $("#update").show();
            $("#updateForm").attr("action", $("#updateForm").attr("action").replace("{ID}", ID));
            $("#name").attr("value", name);
            $("#sum").attr("value", sum);
        }

    </script>
</head>
<body style="color:#fff; background-color:#212529">

<button type="button" class="btn btn-fake">loans</button>
<table class="table table-dark table-striped">
    <tr>
        <th> ID</th>
        <th> Name</th>
        <th> Type</th>
        <th> Customer</th>
        <th> Sum</th>
        <th> Issuance</th>
        <th> Refund</th>
        <th> createdAt</th>
        <th> updatedAt</th>
        <th></th>
        <th>
            <a class="trigger_popup_fricc" id="createA">
                <button type="button" class="btn btn-success">Create</button>
            </a>
        </th>
    </tr>
    <#list loans as loan>
        <tr>
            <td>${loan.id}</td>
            <td>${loan.name}</td>
            <td>${loan.type.name}</td>
            <td>${loan.customer.name}</td>
            <td>${loan.sum}</td>
            <td>${loan.dateIssuance}</td>
            <td style="width: 100px"></td>
            <td>${loan.createdAt}</td>
            <td>${loan.updatedAt}</td>
            <td>
                <a class="trigger_popup_fricc" onclick="getID('${loan.id}','${loan.name}','${loan.sum}')">
                    <button type="button" class="btn btn-success">Update</button>
                </a>
            </td>
            <td>
                <a href="http://localhost:8080/ui/v1/loans/del/${loan.id}">
                    <button type="button" class="btn btn-danger">Delete</button>
                </a>
            </td>
        </tr>
    </#list>
</table>

<#--Create menu-->
<div class="hover_bkgr_fricc" id="create">
    <span class="helper"></span>
    <div>
        <div class="popupCloseButton">&times;</div>
        <h1>Create</h1>
        <form action="/ui/v1/loans/add" method="post">
            <fieldset>
                <table>
                    <th></th>
                    <th></th>
                    <tr>
                        <td><label for="name">Name:</label></td>
                        <td><input type="text" name="name" value="123"><br></td>
                    </tr>
                    <tr>
                        <td><label for="type">Type:</label></td>
                        <td align="left"><select name="type" class="select-css">
                                <#list types as type>
                                    <option value=${type.id}> ${type.id} ${type.name} ${type.conditions.name}</option>
                                </#list>
                            </select></td>
                    </tr>
                    <tr>
                        <td><br></td>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><label for="customer">Customer:</label></td>
                        <td align="left"><select name="customer" class="select-css">
                                <#list customers as customer>
                                    <option value=${customer.id}> ${customer.id} ${customer.name} ${customer.age}</option>
                                </#list>
                            </select></td>
                    </tr>
                    <tr>
                        <td><br></td>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><label for="sum">Sum:</label></td>
                        <td><input type="text" name="sum"><br></td>
                    </tr>
                    <tr style="display: none">
                        <td><label for="payment">Payment:</label></td>
                        <td align="left"><select name="payment" class="select-css">
                                <#list payments as payment>
                                    <option value=${payment.id}> ${payment.id} ${payment.name} ${payment.paid}</option>
                                </#list>
                            </select></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button type="submit" class="btn btn-success">Create</button>
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </div>
</div>


<#--Update menu-->
<div class="hover_bkgr_fricc" id="update">
    <span class="helper"></span>
    <div>
        <div class="popupCloseButton">&times;</div>
        <h1>Update</h1>
        <form action="/ui/v1/loans/edit/{ID}" method="post" id="updateForm">
            <fieldset>
                <table>
                    <th></th>
                    <th></th>
                    <tr>
                        <td><label for="name">Name:</label></td>
                        <td><input type="text" id="name" name="name" value=""><br></td>
                    </tr>
                    <tr>
                        <td><label for="type">Type:</label></td>
                        <td><select name="type" id="type" class="select-css">
                                <#list types as type>
                                    <option value=${type.id}> ${type.id} ${type.name} ${type.conditions.name}</option>
                                </#list>
                            </select></td>
                    </tr>
                    <tr>
                        <td><br></td>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><label for="customer">Customer:</label></td>
                        <td><select name="customer" id="customer" class="select-css">
                                <#list customers as customer>
                                    <option value=${customer.id}> ${customer.id} ${customer.name} ${customer.age}</option>
                                </#list>
                            </select></td>
                    </tr>
                    <tr>
                        <td><br></td>
                        <td><br></td>
                    </tr>
                    <tr>
                        <td><label for="sum">Sum:</label></td>
                        <td><input type="text" id="sum" name="sum" value=""><br></td>
                    </tr>
                    <tr style="display: none">
                        <td><label for="payment">Payment:</label></td>
                        <td><select name="payment" id="payment" class="select-css">
                                <#list payments as payment>
                                    <option value=${payment.id}> ${payment.id} ${payment.name} ${payment.paid}</option>
                                </#list>
                            </select></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td>
                            <button type="submit" class="btn btn-success">Update</button>
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </div>
</div>

<#--Error-->
<div class="hover_bkgr_fricc" id="emptyError">
    <span class="helper"></span>
    <div>
        <div class="popupCloseButton">&times;</div>
        <h1>Error</h1>
        <div>Invalid data type.</div>
    </div>
</div>

</body>
</html>