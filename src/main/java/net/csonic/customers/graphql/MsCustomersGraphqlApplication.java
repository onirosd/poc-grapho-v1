package net.csonic.customers.graphql;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;
import io.opentelemetry.sdk.resources.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import io.opentelemetry.exporter.prometheus.PrometheusHttpServer;
import static io.opentelemetry.semconv.ResourceAttributes.SERVICE_NAME;


@SpringBootApplication
public class MsCustomersGraphqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsCustomersGraphqlApplication.class, args);
    }


}
