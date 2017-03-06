package com.cg.ct;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
public class MyDateFormat extends SimpleTagSupport {
		private String format=null;
		public void setFormat(String format){
			this.format=format;
		}
		@Override
		public void doTag() throws JspException, IOException {
			JspWriter out = getJspContext().getOut();
			   if ( format != null)
			   {
				   SimpleDateFormat sdf = new SimpleDateFormat( format);
				   out.println( sdf.format( new Date()));
			   }
			   else
			       out.println( new Date().toString());
		}
}
