package awstest;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.profile.ProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.GetTopicAttributesResult;

public class TestApp {
    public static void main (String[] args) {
        ProfileCredentialsProvider profileCredentialsProvider = new ProfileCredentialsProvider("mmprivate");
        AWSCredentials awsCredentials = profileCredentialsProvider.getCredentials();

        AmazonSNSClient snsClient = new AmazonSNSClient(awsCredentials);
        snsClient.setRegion(Region.getRegion(Regions.EU_CENTRAL_1));

        GetTopicAttributesResult topicResult = snsClient.getTopicAttributes("arn:aws:sns:eu-central-1:370621384784:0MSMaSere6");
    }
}
