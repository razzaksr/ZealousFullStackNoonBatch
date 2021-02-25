function sasi()
{
	const len=document.getElementsByName('best').length;
	// index+=1
	for(index=0;index<len;index++)
	{
		const ele=document.getElementsByName('best')[index];
		ele.innerHTML=ele.innerHTML+" directed by my favorit Film maker";
		ele.style.backgroundColor="maroon";
		ele.style.color="green";
	}
}

function basedOnClass()
{
	const len=document.getElementsByClassName('tony').length;
	// index+=1
	for(index=0;index<len;index++)
	{
		const ele=document.getElementsByClassName('tony')[index];
		ele.style.backgroundColor="maroon";
		ele.style.color="green";
		ele.style.fontSize='14px';
		ele.style.textAlign='right';
		ele.style.font='cursiva';
	}
}