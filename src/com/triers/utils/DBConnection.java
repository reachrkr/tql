package com.triers.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;

import twitter4j.DirectMessage;
import twitter4j.FilterQuery;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.User;
import twitter4j.auth.AccessToken;
import twitter4j.auth.RequestToken;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

import com.triers.dsl.TestCommands;

public class DBConnection {
	public static Twitter twitter ;
public static Connection connect() throws Exception
{
	Class.forName("com.mysql.jdbc.Driver");
	Connection conn = null;
	conn = DriverManager.getConnection("jdbc:mysql://10.53.138.90:3306/twitter","root", "password");
	return conn;

}


public static void connectTwitter() throws Exception
{
	Twitter twitter = TwitterFactory.getSingleton();
    twitter.setOAuthConsumer("h4RiunqzipySMW0wv57dCA", "VsZw5j2zTcwBsnnfdH0QTxVO4VkV8M783eq9oibn730");
    RequestToken requestToken = twitter.getOAuthRequestToken();
    AccessToken accessToken = null;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    while (null == accessToken) {
      System.out.println("Open the following URL and grant access to your account:");
      System.out.println(requestToken.getAuthorizationURL());
      System.out.print("Enter the PIN(if aviailable) or just hit enter.[PIN]:");
      String pin = br.readLine();
      try{
         if(pin.length() > 0){
           accessToken = twitter.getOAuthAccessToken(requestToken, pin);
         }else{
           accessToken = twitter.getOAuthAccessToken();
         }
      } catch (TwitterException te) {
        if(401 == te.getStatusCode()){
          System.out.println("Unable to get the access token.");
        }else{
          te.printStackTrace();
        }
      }
    }
    //persist to the accessToken for future reference.
    storeAccessToken(twitter.verifyCredentials().getId() , accessToken);
    //Status status = twitter.updateStatus(args[0]);
    //System.out.println("Successfully updated the status to [" + status.getText() + "].");
    System.exit(0);
}

private static void storeAccessToken(long useId, AccessToken accessToken){
	System.out.println(useId);
	System.out.println(accessToken);
    //store accessToken.getToken()
    //store accessToken.getTokenSecret()
  }


public static void connectT() throws Exception
{
	ConfigurationBuilder conf = new ConfigurationBuilder();
	conf.setOAuthConsumerKey("h4RiunqzipySMW0wv57dCA");
	conf.setOAuthConsumerSecret("VsZw5j2zTcwBsnnfdH0QTxVO4VkV8M783eq9oibn730");
	conf.setOAuthAccessToken("42180783-D7NazCWMoazYEEky1wSRZuYk9UC7yZGvjeqcXkiY");
	conf.setOAuthAccessTokenSecret("lgFEMvXuAknlveB7LQEd68XY2YQPc3owesTkWELT0");
	Twitter twitter = new TwitterFactory(conf.build()).getInstance();
	User user = twitter.verifyCredentials();

System.out.println("Successfully verified credentials of " + user.getId());
/*	List<Status> statuses = twitter.getHomeTimeline();
	 System.out.println("Showing home timeline.");
	    for (Status status : statuses) {
	        System.out.println(status.getUser().getName() + ":" +
	                           status.getText());
	    }*/
	    
	    //Twitter sender = TwitterFactory.getSingleton();
	    
	    DirectMessage message = twitter.sendDirectMessage("smjain", "test message for me");
	   // System.out.println("Sent: " message.getText() + " to @" + message.getRecipientScreenName());
}

public static void receive()
{
	ConfigurationBuilder conf = new ConfigurationBuilder();
	conf.setOAuthConsumerKey("7mtVqOHcM5gNAhmbNQicfqnew");
	conf.setOAuthConsumerSecret("m2feSTqv0q6YjbcIXSuGbQULKO4neGEUkovTktopkstNmqz0z0");
	conf.setOAuthAccessToken("42180783-D7NazCWMoazYEEky1wSRZuYk9UC7yZGvjeqcXkiY");
	conf.setOAuthAccessTokenSecret("lgFEMvXuAknlveB7LQEd68XY2YQPc3owesTkWELT0");
	conf.setHttpProxyHost("proxy.sin.sap.corp");
	conf.setHttpProxyPort(8080);
	Configuration config=conf.build();
twitter = new TwitterFactory(config).getInstance();
	StatusListener listener = new StatusListener(){
        public void onStatus(Status status) {
        	
        	//if(status.getUser().getScreenName().equalsIgnoreCase("smjain"))
            System.out.println(status.getUser().getName() + " : "+status.getText() );
            
            String tweet=status.getText();
            String[] tweets=tweet.split("#pooch");
            System.out.println(tweets[1]);
            if(tweets[1]!=null && !tweets[1].equalsIgnoreCase(""))
            {
            	try {
					TestCommands.parser(tweets[1],status.getUser());
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            
        }
        public void onDeletionNotice(StatusDeletionNotice statusDeletionNotice) {}
        public void onTrackLimitationNotice(int numberOfLimitedStatuses) {}
        public void onException(Exception ex) {
            ex.printStackTrace();
        }
		@Override
		public void onScrubGeo(long arg0, long arg1) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void onStallWarning(StallWarning arg0) {
			// TODO Auto-generated method stub
			
		}
    };
    TwitterStream twitterStream = new TwitterStreamFactory(config).getInstance();
    
    //twitterStream.cleanUp();
    twitterStream.addListener(listener);
  //twitterStream.addConnectionLifeCycleListener(arg0);
    
    
    
    
   FilterQuery query = new FilterQuery();
   String[] keywordsArray = { "#pooch"};
   query.track(keywordsArray);
   query.follow(new long[] {42180783});
   
   twitterStream.filter(new FilterQuery(0, new long[] {42180784}, keywordsArray));
  //  twitterStream.filter(query);
   
    // sample() method internally creates a thread which manipulates TwitterStream and calls these adequate listener methods continuously.
    //twitterStream.sample();
}
private static boolean isNumericalArgument(String argument) {
    String args[] = argument.split(",");
    boolean isNumericalArgument = true;
    for (String arg : args) {
        try {
            Integer.parseInt(arg);
        } catch (NumberFormatException nfe) {
            isNumericalArgument = false;
            break;
        }
    }
    return isNumericalArgument;
}
public static void main(String[] args) throws Exception
{
	//connect();
	//connectT();
	receive();
}
}
