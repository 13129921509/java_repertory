package com.cai.chatroom.base.config;

//@Configuration
//@ComponentScan(basePackages = "com.cai")
//@EnableJpaRepositories(
//        basePackages = "com.cai",
//        entityManagerFactoryRef = "entityManagerFactory",
//        transactionManagerRef = "transactionManager")
//@EnableTransactionManagement
public class DaoConfiguration {
//    @Autowired
//    private Environment environment;
//
//    @Value("${datasource.tomcat.maxActive:10}")
//    private int maxPoolSize;
//
//    /*
//     * Populate SpringBoot DataSourceProperties object directly from
//    application.yml
//     * based on prefix.Thanks to .yml, Hierachical data is mapped out of
//    the box with matching-name
//     * properties of DataSourceProperties object].
//     */
//    @Bean
//    @Primary
//    @ConfigurationProperties(prefix = "spring.datasource")
//    public DataSourceProperties dataSourceProperties() {
//        return new DataSourceProperties();
//    }
//
//    /*
//     * Configure HikariCP pooled DataSource.
//     */
//    @Bean
//    public DataSource dataSource() {
//        DataSourceProperties dataSourceProperties = dataSourceProperties();
//        HikariDataSource dataSource =
//                (HikariDataSource)
//                        org.springframework.boot.jdbc.DataSourceBuilder.create(
//                                dataSourceProperties.getClassLoader())
//                                .driverClassName(dataSourceProperties.getDriverClassName())
//                                .url(dataSourceProperties.getUrl())
//                                .username(dataSourceProperties.getUsername())
//                                .password(dataSourceProperties.getPassword())
//                                .type(HikariDataSource.class)
//                                .build();
//        dataSource.setMaximumPoolSize(maxPoolSize);
//        return dataSource;
//    }
//
//    /*
//     * Entity Manager Factory setup.
//     */
//    @Bean
//    public LocalContainerEntityManagerFactoryBean entityManagerFactory() throws NamingException {
//        LocalContainerEntityManagerFactoryBean factoryBean =
//                new LocalContainerEntityManagerFactoryBean();
//        factoryBean.setDataSource(dataSource());
//        factoryBean.setPackagesToScan(new String[] {"com.cai"});
//        factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
//        factoryBean.setJpaProperties(jpaProperties());
//        return factoryBean;
//    }
//
//    /*
//     * Provider specific adapter.
//     */
//    @Bean
//    public JpaVendorAdapter jpaVendorAdapter() {
//        HibernateJpaVendorAdapter hibernateJpaVendorAdapter = new HibernateJpaVendorAdapter();
//        return hibernateJpaVendorAdapter;
//    }
//
//    /*
//     * Here you can specify any provider specific properties.
//     */
//    private Properties jpaProperties() {
//        Properties properties = new Properties();
//        properties.put(
//                "hibernate.dialect",
//                environment.getRequiredProperty("spring.jpa.properties.hibernate.dialect"));
//        return properties;
//    }
//
//    @Bean
//    @Autowired
//    public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
//        JpaTransactionManager txManager = new JpaTransactionManager();
//        txManager.setEntityManagerFactory(emf);
//        return txManager;
//    }
}
