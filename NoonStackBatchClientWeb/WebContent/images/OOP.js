function Item(alpha,beta,cosmo)
{
	this.name=alpha;
	this.price=beta;
	this.qty=cosmo;
	//alert("Object created "+this.price);
	this.show=display;
}

function display()
{
	document.write("Name of item "+this.name+" Price of Each "+this.price+" Quantity "+this.qty+" Net amount "+(this.price*this.qty));
}

function UPI(use,pin,bal)
{
	this.id=use;
	this.pin=pin;
	this.balance=bal;
	this.activity=transfer;
}

function transfer()
{
	var hai=prompt("Tell us UPI Id: ","");
	var amt=prompt("Tell us amount: ","");
	if(amt<=this.balance)
	{
		var temp=prompt("Tell us UPI pin to complete the process: ","")
		if(temp==this.pin)
		{
			this.balance-=amt;
			alert("Fund "+amt+" has transferred to "+hai);
		}
		else
		{
			alert("Invalid PIN");
		}
	}
	else
	{
		alert("Insufficient amount");
	}
}