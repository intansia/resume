package com.example.zxcvbn.resume_anita;
import java.util.List;
/**
 * Created by zxcvbn on 19/07/2016.
 */
public class ResponseResume {
    private String error;
    private List<ModelResume> hasil;

    public String getError(){
        return this.error;
    }

    public void setError(String error){
        this.error=error;
    }

    public List<ModelResume> getHasilResume(){
        return this.hasil;
    }

    public void setHasilBola(List <ModelResume> hasil){
        this.hasil=hasil;
    }
}
