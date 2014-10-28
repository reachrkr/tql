package com.triers.utils;

import java.util.Locale;

import com.dropbox.core.DbxAppInfo;
import com.dropbox.core.DbxAuthFinish;
import com.dropbox.core.DbxClient;
import com.dropbox.core.DbxRequestConfig;
import com.dropbox.core.DbxWebAuthNoRedirect;
//ObuoDZ7nUdwAAAAAAAADGdCq5yXwCybhn34qQpT1ykE
public class DropBoxClient {
public static void main(String[] args) throws Exception
{
	
	/* java.util.Properties systemProperties = System.getProperties();
	    systemProperties.setProperty("http.proxyHost", "proxy.sin.sap.corp");
	    systemProperties.setProperty("http.proxyPort", "8080");
	    System.setProperty("java.net.useSystemProxies", "true");    */
	final String APP_KEY = "zhwooe1iw9f8d35";
    final String APP_SECRET = "5hy9f236j3qnd2h";

    DbxAppInfo appInfo = new DbxAppInfo(APP_KEY, APP_SECRET);
    

    DbxRequestConfig config = new DbxRequestConfig(
        "testme555", Locale.getDefault().toString());
    
    DbxWebAuthNoRedirect webAuth = new DbxWebAuthNoRedirect(config, appInfo);
    
    String authorizeUrl = webAuth.start();
    
    DbxAuthFinish authFinish = webAuth.finish("ObuoDZ7nUdwAAAAAAAADGdCq5yXwCybhn34qQpT1ykE");
    String accessToken = authFinish.accessToken;
    
    DbxClient client = new DbxClient(config, accessToken);
    
    System.out.println("Linked account: " + client.getAccountInfo().displayName);
}
}
