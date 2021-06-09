package hai;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class OfferHandler extends TagSupport
{

	@Override
	public int doAfterBody() throws JspException {
		// TODO Auto-generated method stub
		JspWriter jsp=pageContext.getOut();
		try {
			jsp.append(" applied the job");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.doAfterBody();
	}

	@Override
	public int doEndTag() throws JspException {
		// TODO Auto-generated method stub
		return super.doEndTag();
	}

	@Override
	public int doStartTag() throws JspException {
		// TODO Auto-generated method stub
		return EVAL_BODY_INCLUDE;
	}
}
