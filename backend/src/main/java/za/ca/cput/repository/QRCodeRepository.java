package za.ca.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ca.cput.domain.QRCode;

public interface QRCodeRepository extends JpaRepository<QRCode, Long> {}
