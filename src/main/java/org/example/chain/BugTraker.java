package org.example.chain;

/**
 * Клиентский класс
 */
public class BugTraker {
    public static void main(String[] args) {
        Notifier report = new SimpleReport(Priority.ROUTINE);
        Notifier email = new EmailNotifier(Priority.IMPORTANT);
        Notifier sms = new SMSNotifier(Priority.ASAP);
        report.setNextNotifier(email);
        email.setNextNotifier(sms);

        //т.е по умолч. мы отправляем просто отчет. Если что-то более важное отчет и емаил. Или если очень очень важное то отправляем все виды отчетности


//        report.notifyManager("Everything is ok", Priority.ROUTINE);
//        report.notifyManager("Something is wrong", Priority.IMPORTANT);
        report.notifyManager("Атас", Priority.ASAP);

    }

}
