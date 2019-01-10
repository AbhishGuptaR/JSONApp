<?php  
$username="root";  
$password="";  
$hostname = "localhost";  
//connection string with database  
$dbhandle = mysqli_connect($hostname, $username, $password,'jsondata') ; 
/*or die("Unable to connect to MySQL");  
echo "Connected to MySQL<br>";  
// connect with database  
$selected = mysql_select_db("jsondata",$dbhandle)  
or die("Could not select examples");  
//query fire  */
$result = mysqli_query($dbhandle,"SELECT * FROM data1");  
$json_response = array();  
// fetch data in array format  
while ($row = mysqli_fetch_array($result, MYSQLI_ASSOC)) {  
// Fetch data of Fname Column and store in array of row_array  
$json_response[]=$row;
}
$value = array();  
$value=$json_response;
/*
$row_array['Title'] = $row['Title'];
$row_array['Listings'] = $row['Listings'];
$row_array['Amount'] = $row['Amount'];
//push the values in the array  
array_push($json_response,$row_array);  
*/ 
echo json_encode($value);  
?>  
