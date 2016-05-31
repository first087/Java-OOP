package workshop;

import java.util.Date;

/**
 * Created by Artit on 31/5/2559.
 */
public class Workshop1 {
    private Date dateCreate;

    public Workshop1() {
        dateCreate = new Date();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Date getDateCreate() {
        return dateCreate;
    }
}
