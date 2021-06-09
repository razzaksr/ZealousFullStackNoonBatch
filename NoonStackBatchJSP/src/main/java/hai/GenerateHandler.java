package hai;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class GenerateHandler extends TagSupport
{
	private double basic;
	private int exp;
	private double newsal;
	private String info="";
	public void setBasic(double basic) {
		this.basic = basic;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		if(exp>=2&&exp<6)
		{
			info="5 percent hike";
			newsal=basic+(basic*0.050);
		}
		else if(exp>=6&&exp<8)
		{
			info="10 percent hike";
			newsal=basic+(basic*0.100);
		}
		else if(exp>=8&&exp<12)
		{
			info="12 percent hike";
			newsal=basic+(basic*0.120);
		}
		else
		{
			info="no hike";
			newsal=basic;
		}
		return super.doAfterBody();
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		JspWriter jsp=pageContext.getOut();
		try {
			jsp.append("<h1>Your new salary is "+ newsal +"</h1><h3>"+info+"</h3>");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doEndTag();
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_BODY_INCLUDE;
	}

}
