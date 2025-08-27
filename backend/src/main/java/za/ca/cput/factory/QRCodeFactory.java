package za.ca.cput.factory;

import za.ca.cput.domain.QRCode;

public class QRCodeFactory {
    public static QRCode createQRCode(String data, String format, String image) {
        return new QRCode.Builder()
                .setData(data)
                .setFormat(format)
                .setImage(image)
                .build();
    }
}
