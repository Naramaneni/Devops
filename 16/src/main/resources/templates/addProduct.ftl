<#import "/spring.ftl" as spring>
<html>
<h1>Add New Product</h1>
<ul>
	<form name="product" action="/keydemo/products/add" method="post">

    <li>Name <input type="text" name="name"></li>
	<li>Price <input type="text" name="price"></li>

	<li><input type="submit"></li>

	</form>
</ul>

<br>
<a href="/keydemo/products">Back to Product List</a>
<br>
<a href="/keydemo/logout">Logout</a>
</html>