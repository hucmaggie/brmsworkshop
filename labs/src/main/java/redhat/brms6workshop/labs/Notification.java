package redhat.brms6workshop.labs;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(513cc9595864bbe4ead44386f45a9140)
 */
@org.kie.api.definition.type.Label(value = "Notification")
public class Notification  implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "Agent Name")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.String agentName;
    
    @org.kie.api.definition.type.Label(value = "Email ID")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String emailID;
    
    @org.kie.api.definition.type.Label(value = "Insured Name")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String insuredName;
    
    @org.kie.api.definition.type.Label(value = "Quote ID")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.Integer quoteID;

    public Notification() {
    }

    public Notification(java.lang.String agentName, java.lang.String emailID, java.lang.String insuredName, java.lang.Integer quoteID) {
        this.agentName = agentName;
        this.emailID = emailID;
        this.insuredName = insuredName;
        this.quoteID = quoteID;
    }


    
    public java.lang.String getAgentName() {
        return this.agentName;
    }

    public void setAgentName(java.lang.String agentName) {
        this.agentName = agentName;
    }
    
    public java.lang.String getEmailID() {
        return this.emailID;
    }

    public void setEmailID(java.lang.String emailID) {
        this.emailID = emailID;
    }
    
    public java.lang.String getInsuredName() {
        return this.insuredName;
    }

    public void setInsuredName(java.lang.String insuredName) {
        this.insuredName = insuredName;
    }
    
    public java.lang.Integer getQuoteID() {
        return this.quoteID;
    }

    public void setQuoteID(java.lang.Integer quoteID) {
        this.quoteID = quoteID;
    }
}