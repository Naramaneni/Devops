<#import "/spring.ftl" as spring>
<html>
<h1>My products</h1>
<ul>
<#list products as product>
    <li>${product.name} - ${product.price} - ${product.createdBy}</li>
</#list>
</ul>

<br>
<a href="/keydemo/productAdd">Add Product</a>
<br>
<a href="/keydemo/logout">Logout</a>
</html>