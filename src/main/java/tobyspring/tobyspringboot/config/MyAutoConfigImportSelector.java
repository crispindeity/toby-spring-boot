package tobyspring.tobyspringboot.config;

import org.springframework.context.annotation.DeferredImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyAutoConfigImportSelector implements DeferredImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[] {
                "tobyspring.tobyspringboot.config.autoconfig.TomcatWebServerConfig",
                "tobyspring.tobyspringboot.config.autoconfig.TomcatWebServerConfig"
        };
    }
}
