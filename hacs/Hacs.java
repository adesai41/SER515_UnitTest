package hacs;

import java.io.IOException;

/**
 * Title: HACS Description: Copyright: Copyright (c) 2002 Company: msu
 *
 * @author Zhang ji Zhu Wei
 * @author mjfindler
 * @version 2.0
 * <p>
 * Update to Java 8
 */

public class Hacs {

    static Facade theFacade = new Facade();

    public Hacs() {
        System.out.println("hacs constructor called!");
    }

    public static void main(String[] args) throws IOException {
        UserInfoItem userinfoitem = new UserInfoItem();
        theFacade.createCourseList();
        while (true) {
            boolean bExit = false;
            bExit = theFacade.Login(userinfoitem);
            if (bExit) {
                break;
            }
            theFacade.createUser(userinfoitem);
            theFacade.attachCourseToUser();
            if (userinfoitem.userType == UserInfoItem.USER_TYPE.Student) { // if is a student remind him of the due date
                theFacade.remind();
            }
            boolean bLogout = false;
            while (!bLogout) {
                bLogout = theFacade.selectCourse();
                if (bLogout) {
                    break;
                }
                bLogout = theFacade.courseOperation();
            }
        }
    }
}