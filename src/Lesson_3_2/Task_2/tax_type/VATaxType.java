package Lesson_3_2.Task_2.tax_type;

import java.math.BigDecimal;

public class VATaxType extends TaxType {

    @Override
    public BigDecimal calculateTaxFor(BigDecimal amount) { return amount.multiply(new BigDecimal("0.18")); }
}