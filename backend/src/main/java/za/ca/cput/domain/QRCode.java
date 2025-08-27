package za.ca.cput.domain;

import jakarta.persistence.*;

@Entity
public class QRCode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String data;
    private String format;
    private String image; // Can be stored as Base64 string or URL

    protected QRCode() {}

    private QRCode(Builder builder) {
        this.id = builder.id;
        this.data = builder.data;
        this.format = builder.format;
        this.image = builder.image;
    }

    public Long getId() { return id; }

    public static class Builder {
        private Long id;
        private String data;
        private String format;
        private String image;

        public Builder setId(Long id) { this.id = id; return this; }
        public Builder setData(String data) { this.data = data; return this; }
        public Builder setFormat(String format) { this.format = format; return this; }
        public Builder setImage(String image) { this.image = image; return this; }

        public QRCode build() { return new QRCode(this); }
    }
}
