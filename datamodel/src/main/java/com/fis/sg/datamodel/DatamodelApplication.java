package com.fis.sg.datamodel;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fis.sg.datamodel.entity.Datamodel;
import com.fis.sg.datamodel.repository.DatamodelRepository;

@SpringBootApplication
public class DatamodelApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatamodelApplication.class, args);
	}

	@Bean
    public CommandLineRunner bookDemo(DatamodelRepository datamodelRepository) {
        return (args) -> {

		datamodelRepository.save(new Datamodel("TradeId","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("Account","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("Price","Float","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("Market","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("TradeId","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("APS","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("TradeId","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("TradeId","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("TradeId","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("TradeId","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("AccountRef","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("TradeId","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("ClientCode","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		datamodelRepository.save(new Datamodel("TradeId","String","Internal","hdr/@TID","IFEU<1234<@CLU1234","123","Some Description"));
		
		System.out.println("Run ho gaya");
		};
	}
}
