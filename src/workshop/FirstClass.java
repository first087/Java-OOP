package workshop;

import java.util.Date;

/**
 * Created by Artit on 31/5/2559.
 */
public class FirstClass {
    private String objectName;
    private Date dateCreate;

    public FirstClass(String objectName) {
        this.objectName = objectName;
        dateCreate = new Date();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public Date getDateCreate() {
        return dateCreate;
    }
}
