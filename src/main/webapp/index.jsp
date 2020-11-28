<html>
<body>
<h2>Search Entries</h2>

<form action="search" method="POST" >

SEARCH:- 
<input type="radio" id="Group" value="ou=Groups,dc=st,dc=com" name="shubham" checked>
    <label for="Group">group</label>

<input type="radio" id="People" value="ou=people,dc=st,dc=com" name="shubham">
    <label for="People">people</label>
<br><br>
 WHERE: <select name="searchtype">
    <option value="cn">Full name</option>
    <option value="sn">Last name</option>
    <option value="mail">e-mail address</option>
    <option value="telephoneNumber">TINA phone number</option>
    <option value="st-eduid">Enterpreise Directory ID(st-eduid)</option>
    <option value="uid">Login</option>
    <option value="st-secondaryuid">Other Login</option>
    <option value="mobile">Mobile Number</option>
  </select>
  <br>
  <br>
    <select name="filter">
    <option value="startswith">Starts With</option>
    <option value="endswith">ends with</option>
    <option value="contain">contains</option>
    <option value="is">is</option>
   </select>
  <br>
  <br>
 <input type="text" name="text">
  <br>
  <br>
<input type="submit" name="submit">
</form>
</body>
</html>
