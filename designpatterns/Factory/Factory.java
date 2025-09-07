package designpatterns.Factory;

public class Factory {
    String Platform;
    public Factory(String Platform){
        this.Platform = Platform;
    }

    public Notification CreatePlatform() throws Exception {
        if(Platform.equals("Android")){
            return new Android();
        }else if(Platform.equals("Ios")){
            return new Ios();
        }else{
            throw new Exception("unknown platform");
        }
    }
}
