package com.sw409.FairfieldUstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sw409.FairfieldUstore.models.Product;
import com.sw409.FairfieldUstore.services.ProductService;

@SpringBootApplication
public class FairfieldUStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FairfieldUStoreApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(ProductService productService) {
		return args -> {
			productService.save(new Product(1L, "Women’s Sweatshirt", 60.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-Q10-MS-Snowy-Garnet?$HomePageRecs_ET$"));
			productService.save(new Product(2L, "Knit pom Beanien", 30.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-NE20SPORT-SCSPC-School-Specific?$HomePageRecs_ET$"));
			productService.save(new Product(3L, "Stags Winter Jacket", 60.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-16601-AXRDA-Graphite?$HomePageRecs_ET$"));
			productService.save(new Product(4L, "Bulb Ornament", 15.00, "https://bkstr.scene7.com/is/image/Bkstr/6-62-PZ--2H--Silver?$HomePageRecs_ET$"));
			productService.save(new Product(5L, "Flannel Pants", 35.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-GHA-WDMK1-Black-Red?$HomePageRecs_ET$"));
			productService.save(new Product(6L, "Cap", 25.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-UH100M-17UCH4-Graphite?$HomePageRecs_ET$"));
			productService.save(new Product(7L, "Pack-N-Go Jacket", 40.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-CB1016-P2532527-Red-Black?$HomePageRecs_ET$"));
			productService.save(new Product(8L, "Banded Sweatpants", 35.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-CP2071-P2207381-Heather-Grey?$HomePageRecs_ET$"));
			productService.save(new Product(9L, "Stags UText Gloves", 15.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-1016-MSCT-Red?$HomePageRecs_ET$"));
			productService.save(new Product(10L, "Christmas Card", 20.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-A6HC-1361-White?$HomePageRecs_ET$"));
			productService.save(new Product(11L, "Bundle Up", 30.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-P056-SCSPC-School-Specific?$HomePageRecs_ET$"));
			productService.save(new Product(12L, "Headband", 15.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-G020-SCSP-Red?$HomePageRecs_ET$"));
			productService.save(new Product(13L, "Mittens", 25.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-W007-SCSPC-Red?$HomePageRecs_ET$"));
			productService.save(new Product(14L, "Women’s Plush Socks", 25.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-DOTSOCK-SCSPC?$HomePageRecs_ET$"));
			productService.save(new Product(15L, "Drawstring Backpack", 15.00, "https://bkstr.scene7.com/is/image/Bkstr/6-33-PZ--H8-B-Red?$HomePageRecs_ET$"));
			productService.save(new Product(16L, "Face Covering 2pack", 20.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-COGM-11267-School-Specific?$HomePageRecs_ET$"));
			productService.save(new Product(17L, "Dri-Fit Short Sleeve T-shirt", 30.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-M11843-P016430-Black?$HomePageRecs_ET$"));
			productService.save(new Product(18L, "Stags Infant Bodysuit", 20.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-10802-114510-Red?$HomePageRecs_ET$"));
			productService.save(new Product(19L, "Mug 15oz", 20.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-7170-15F03A1C-White?$HomePageRecs_ET$"));
			productService.save(new Product(20L, "Dog T-Shirt", 20.00, "https://bkstr.scene7.com/is/image/Bkstr/6-33-PZ--QV--Red?$HomePageRecs_ET$"));
			productService.save(new Product(21L, "Slim Can Coozie", 10.00, "https://bkstr.scene7.com/is/image/Bkstr/1276-25512-STRIPE-School-Specific?$HomePageRecs_ET$"));
		};
	}

}
