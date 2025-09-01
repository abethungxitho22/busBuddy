package za.ca.cput.service;

import org.springframework.stereotype.Service;
import za.ca.cput.domain.QRCode;
import za.ca.cput.repository.QRCodeRepository;

import java.util.Optional;

@Service
public class QRCodeService implements IService<QRCode, Long> {

    private final QRCodeRepository repository;

    public QRCodeService(QRCodeRepository repository) {
        this.repository = repository;
    }

    @Override
    public QRCode create(QRCode qrCode) {
        return repository.save(qrCode);
    }

    @Override
    public QRCode read(Long id) {
        Optional<QRCode> qrCode = repository.findById(id);
        return qrCode.orElse(null);
    }

    @Override
    public QRCode update(QRCode qrCode) {
        if (repository.existsById(qrCode.getId())) { // adjust field name if different
            return repository.save(qrCode);
        }
        return null;
    }

    @Override
    public boolean delete(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;

    }
}
