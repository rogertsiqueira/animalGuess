dataSource {
	pooled = true
	driverClassName = "com.mysql.jdbc.Driver"
	dialect = "org.hibernate.dialect.MySQL5InnoDBDialect"
}
hibernate {
	cache.use_second_level_cache = true
	cache.use_query_cache = true
	cache.region.factory_class = 'org.hibernate.cache.ehcache.EhCacheRegionFactory'
}
// environment specific settings
environments {
	development {
		dataSource {
			dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
			url = "jdbc:mysql://localhost/teste?useUnicode=yes&characterEncoding=UTF-8"
			username = "root"
			password = "rogert"
		}
	}
	test {
		dataSource {
			dbCreate = "update"
			url = "jdbc:mysql://localhost/teste?useUnicode=yes&characterEncoding=UTF-8"
			username = "root"
			password = "rogert"
		}
	}
	production {
		dataSource {
			dbCreate = "update"
			url = "jdbc:mysql://localhost/teste?useUnicode=yes&characterEncoding=UTF-8"
			username = "root"
			password = "rogert"
		}
	}
}