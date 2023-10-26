package org.lessons.java.collection;

public class Regalo {
    private String descrizione;
    private String destinatario;

    public Regalo(String descrizione, String destinatario) {
        this.descrizione = descrizione;
        this.destinatario = destinatario;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
}
