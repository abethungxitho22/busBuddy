package za.ca.cput.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import za.ca.cput.domain.QRCode;
import za.ca.cput.service.QRCodeService;

import java.util.List;

@RestController
@RequestMapping("/qrcode")
public class QRCodeController {

    private final QRCodeService service;

    public QRCodeController(QRCodeService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<QRCode> create(@RequestBody QRCode qrCode) {
        return ResponseEntity.ok(service.create(qrCode));
    }

    @GetMapping("/{id}")
    public ResponseEntity<QRCode> read(@PathVariable Long id) {
        QRCode qrCode = service.read(id);
        return qrCode != null ? ResponseEntity.ok(qrCode) : ResponseEntity.notFound().build();
    }

    @PutMapping
    public ResponseEntity<QRCode> update(@RequestBody QRCode qrCode) {
        return ResponseEntity.ok(service.update(qrCode));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }


}
