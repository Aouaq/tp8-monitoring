package ma.ens.tp8_monitoring;

import io.micrometer.core.instrument.Metrics;

public String processData() {
    Metrics.counter("custom.requests.count").increment();
    logger.info("Requête enregistrée dans Prometheus");
    return "Traitement terminé";
}