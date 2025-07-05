using RetailInventory.Models;
using Microsoft.EntityFrameworkCore;

namespace RetailInventory;

class Program {
    static void Main() {
        using var context = new AppDbContext();

        context.Database.Migrate();

        var products = context.Products.Include(p => p.Category).ToList();
        foreach (var p in products) {
            Console.WriteLine($"{p.Name} - ₹{p.Price} - {p.Category?.Name}");
        }
    }
}
