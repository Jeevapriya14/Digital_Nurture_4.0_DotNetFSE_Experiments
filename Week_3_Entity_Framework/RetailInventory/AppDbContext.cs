using Microsoft.EntityFrameworkCore;
using RetailInventory.Models;

namespace RetailInventory;

public class AppDbContext : DbContext {
    public DbSet<Product> Products { get; set; }
    public DbSet<Category> Categories { get; set; }

    protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder) {
        optionsBuilder.UseSqlite("Data Source=retail_inventory.db");
    }

    protected override void OnModelCreating(ModelBuilder modelBuilder) {
        modelBuilder.Entity<Category>().HasData(
            new Category { Id = 1, Name = "Electronics" },
            new Category { Id = 2, Name = "Groceries" }
        );

        modelBuilder.Entity<Product>().HasData(
            new Product { Id = 1, Name = "Smartphone", Price = 25000, CategoryId = 1 },
            new Product { Id = 2, Name = "Wheat Flour", Price = 800, CategoryId = 2 }
        );
    }
}
