public class Message {

    private String recipient, sender, text;

    public void setRecipient(String recipient)
    {
        this.recipient = recipient;
    }

    public void setSender(String sender)
    {
        this.sender = sender;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public String getRecipient()
    {
        return recipient;
    }

    public String getSender()
    {
        return sender;
    }

    public String getText()
    {
        return text;
    }

    public Message(String sender, String recipient)
    {
        setSender(sender);
        setRecipient(recipient);
    }

    public void append(String text)
    {
        setText(text);
    }

    public String toString()
    {
        return "From:\t\t" + getSender() +
                "\nTo:\t\t" + getRecipient() +
                "\nText:\t\t" + getText();
    }

}
