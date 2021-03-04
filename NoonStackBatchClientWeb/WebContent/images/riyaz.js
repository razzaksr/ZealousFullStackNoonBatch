function validate()
{
	var status=true;
	var a=document.forms['signup'].fname.value;
	var b=document.forms['signup'].lname.value;
	var c=document.forms['signup'].email.value;
	var d=document.forms['signup'].day.value;
	var e=document.forms['signup'].month.value;
	var f=document.forms['signup'].year.value;
	var g=document.forms['signup'].country.value;
	var h=document.forms['signup'].mobile.value;
	var i=document.forms['signup'].choose.value;
	var j=document.forms['signup'].confirm.value;
	//var k=document.forms['signup'].gender.value;
	var l=document.forms['signup'].news.checked;
	var m=document.forms['signup'].contribute.checked;
	var reg=/^(?=.*[0-9])(?=.*[!@#$%])[a-zA-Z0-9!@#$%]{8,}$/;
	//alert(k);
	
	if(!((/^[a-zA-Z]/).test(a) && (/^[a-zA-Z]/).test(b) || 
	(/^(?=.*[0-9])(?=.*[@.])[a-zA-Z0-9@.]$/).test(c)))
	{
		status=false;
	}
	if(!(/^[a-zA-Z]+$/).test(g))
	{
		status=false;
	}
	if(!(/^[0-9]+$/).test(h))
	{
		status=false;
	}
	if(!(reg.test(i)||reg.test(j)))
	{
		status=false;
	}
	if(i!=j)
	{
		alert('passwords mismatch');
		status=false;
	}
	if((d=='Select Day' || e=='Select Month'||f=='Select Year'))
	{
		status=false;
	}
	if(!(document.getElementById('male').checked || 
	document.getElementById('female').checked ||
	document.getElementById('other').checked))
	{
		status=false;
	}
	return status;
	/*if(!(/^[a-zA-Z]/.test(a) || /^[a-zA-Z]/.test(b)
	|| /^(?=.*[0-9])(?=.*[@.])[a-zA-Z0-9@.]$/.test(c)
	|| /^[a-zA-Z]/.test(g)
	|| /^(?=.*[0-9]){10,}$/.test(h)
	|| (reg.test(i)||reg.test(j)) || i!=j)
	&&(d=='Select Day' || e=='Select Month'||f=='Select Year')&&k==false)
	{
		console.log("Validation failes");
								return false;
	}
	return true;*/
}