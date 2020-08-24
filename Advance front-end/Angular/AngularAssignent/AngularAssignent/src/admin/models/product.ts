export interface Product {
    id?: number;
    name: string;
    description?: string;
    slug?: string;
    category_id: number;
    sell_price: number;
    image?: string;
    createdAt?: string| Date;
}