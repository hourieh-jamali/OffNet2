package bees.elite.ir.offnet.config;


/*import ir.seraj.generalnotification.user.UserAuthTokenModel;
import ir.seraj.generalnotification.user.UserNoteModel;*/
import bees.elite.ir.offnet.user.UserAuthTokenModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by yazdandoost on 9/21/2016.
 */
public interface SerajAPI {
    //@GET("/erp/jersey/mobileRestFace/authenticate")
    @GET("/api/authenticate")
    Call<String> authenticateUser(@Query("username") String username, @Query("password") String password, @Query("deviceId") String deviceId);
/*
    @GET("/jersey/mobileRestFace/getNewUserNotesByToken")
    Call<UserNoteModel> getNewUserNotesByToken(@Query("token") String token);

    @GET("/jersey/mobileRestFace/getNewUserNotesByToken")
    Call<UserNoteModel> getNewUserNotesByToken(@Query("token") String token, @Query("filter") String filter);

    @GET("/jersey/mobileRestFace/makeUserNoteVisitedMobile")
    Call<String> makeUserNoteVisitedMobile(@Query("userNoteId") String userNoteId, @Query("deviceId") String deviceId);

    @GET("/jersey/mobileRestFace/makeUserNoteArchivedMobile")
    Call<String> makeUserNoteArchivedMobile(@Query("userNoteId") String userNoteId, @Query("deviceId") String deviceId);*/
}