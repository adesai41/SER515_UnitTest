package hacs;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class ReminderVisitorTest {

    @Test
    void VisitAssignmentTest() {
        //test for VisitAssignment method
        ReminderVisitor reminderVisitor = new ReminderVisitor(new Reminder());
        Assignment assignment = new Assignment();
        assignment.setAssignmentName("SER 515");
        assignment.setDueDate(new Date());
        reminderVisitor.visitAssignment(assignment);
        assertNotNull(reminderVisitor.getmReminder().listUpcoming);
    }

    @Test
    void ReminderVisitorTest() {
        //test for ReminderVisitor method
        new ReminderVisitor();
    }

    @Test
    void ReminderVisitorReminderTest() {
        //test for ReminderVisitorReminder method
        ReminderVisitor reminderVisitor = new ReminderVisitor(new Reminder());
        assertNotNull(reminderVisitor.getmReminder());
    }
}