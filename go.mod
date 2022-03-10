module github.com/GoogleCloudPlatform/golang-samples

go 1.15

require (
	cloud.google.com/go/bigquery v1.26.0
	cloud.google.com/go/compute v1.2.0 // indirect
	cloud.google.com/go/datastore v1.2.0
	cloud.google.com/go/errorreporting v0.1.0
	cloud.google.com/go/gaming v1.0.0
	cloud.google.com/go/logging v1.0.0
	cloud.google.com/go/storage v1.19.0
	cloud.google.com/go/vision v1.0.0
	github.com/bmatcuk/doublestar/v2 v2.0.4
	github.com/golang/groupcache v0.0.0-20210331224755-41bb18bfe9da // indirect
	github.com/golang/protobuf v1.5.2
	github.com/google/uuid v1.3.0
	github.com/h2non/filetype v1.1.1
	golang.org/x/oauth2 v0.0.0-20211104180415-d3ed0bb246c8
	golang.org/x/text v0.3.7 // indirect
	google.golang.org/api v0.66.0
	google.golang.org/genproto v0.0.0-20220201184016-50beb8ab5c44
	google.golang.org/grpc v1.44.0 // indirect
	google.golang.org/protobuf v1.27.1
	gopkg.in/check.v1 v1.0.0-20190902080502-41f04d3bba15 // indirect
	gopkg.in/yaml.v2 v2.4.0
)

// https://github.com/jstemmer/go-junit-report/issues/107
replace github.com/jstemmer/go-junit-report => github.com/tbpg/go-junit-report v0.9.2-0.20200506144438-50086c54f894