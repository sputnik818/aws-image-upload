package com.sputnik.awsimageupload.datastore;

import com.sputnik.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {
    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static{
//        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"AlPacino", null));
//        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"RobertDeNiro", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("0d49751a-0b70-433a-84e0-476a2d03d63c"),"AlPacino", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("396b4c6f-4523-4ac2-b0ee-1bd4ee22f410"),"RobertDeNiro", null));
    }

    public List<UserProfile> getUserProfiles(){
        return USER_PROFILES;
    }
}
