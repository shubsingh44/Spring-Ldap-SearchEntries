package com.st.Dao;

import java.util.List;

import javax.naming.Name;
import javax.naming.ldap.LdapName;

import static org.springframework.ldap.query.LdapQueryBuilder.query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ldap.core.LdapTemplate;
import org.springframework.ldap.query.LdapQuery;
import org.springframework.ldap.query.SearchScope;
import org.springframework.ldap.support.LdapNameBuilder;
import org.springframework.stereotype.Service;

import com.st.model.User;
@Service
public class OdmPersonRepo {
   @Autowired
   private LdapTemplate ldapTemplate;

   public List<User> findByUid(String searchtype,String filter,String value) {
	  
	       // people search working group search has been done by simranjeet
	       String prefix = "",suffix = "";
	       if(filter.equals("is"))
	       {
	    	   prefix="";
	    	   suffix="";
	       }
	       else if(filter.equals("startswith"))
		    {
		    	   prefix="";
		    	   suffix="*";
		    }
	       else if(filter.equals("endswith"))
	       {
	    	   prefix="*";
	    	   suffix="";
	       }
	       
	       else if(filter.equals("contain"))
	       {
	    	   prefix="*";
	    	   suffix="*";
	       }
	       //System.out.println(prefix+value+suffix);
		   
		   LdapQuery query  =  query()
	                .base("ou=people,dc=st,dc=com")
	                .searchScope(SearchScope.ONELEVEL)
	                .where(searchtype).like(prefix+value+suffix);
		   return ldapTemplate.find(query, User.class);
    }
}