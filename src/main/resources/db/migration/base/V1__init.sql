create schema if not exists smarthome;

grant all on schema smarthome to ${dbUser};
grant all on all tables in schema smarthome to ${dbUser};

create table if not exists smarthome.blind(id UUID not null primary key,
                      description varchar,
                      position_in_percent numeric);